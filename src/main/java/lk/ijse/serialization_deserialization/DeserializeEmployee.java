package lk.ijse.serialization_deserialization;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class DeserializeEmployee {
    public static void main(String[] args){
        ObjectMapper mapper = new ObjectMapper();
        try {
            Employee employee = mapper.readValue(new File("employee.json"), Employee.class);
            System.out.println("Employee deserialized from 'employee.json'");
            System.out.println(employee);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}