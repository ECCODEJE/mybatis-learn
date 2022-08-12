package com.koppi.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author hechao
 * @date 2022/8/12 15:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private Integer cid;
    private Course course;
}
