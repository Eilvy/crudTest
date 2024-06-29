package com.test.crudt.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private Integer id;
    private String msg;
    private Object data;

    //增删改成功
    public static Result success(){
        return new Result(1,"success",null);
    }
    //查询成功
    public static Result success(Object data){
        return new Result(1,"success",data);
    }
    //失败
    public static Result error(String msg){
        return new Result(0,msg,null);
    }
}
