package com.model;

public class EmployData {
    private String id;
    private String name;
    private String email;
    private String age;
    private String dob;

    public String getId() {
        return id;
    }

    public void setId(int id) {
        if(id<10)
        {
           String strid = Integer.toString(id);
           String convertedid = "000"+strid;
           this.id = convertedid;
        }
        if(id>=10 && id<100)
        {
            String strid = Integer.toString(id);
            String convertedid = "00"+strid;
            this.id = convertedid;
        }
        if(id>=100 && id<1000)
        {
            String strid = Integer.toString(id);
            String convertedid = "0"+strid;
            this.id = convertedid;
        }
        if(id==1000)
        {
            this.id = Integer.toString(id);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
