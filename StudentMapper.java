package com.sample.Mapper;

import com.sample.dto.Studentdto;
import com.sample.entity.Student;

public class StudentMapper {
    public static Studentdto mapUserdto(Student student){
        return new Studentdto(
            student.getProd_id(),
            student.getProductname(),
            student.getPrice(),
            student.getRatings(),
            student.getDiscount(),
            student.getAvailability());

        }
        public static Student maptoStudent(Studentdto studto){
            return new Student(
                studto.getProd_id(),
                studto.getProductname(),
                studto.getPrice(),
                studto.getRating(),
                studto.getDiscount(),
                studto.getAvailability());

        }
    }

