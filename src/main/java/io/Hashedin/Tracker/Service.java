package io.Hashedin.Tracker;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Service {
    @Id
    private  Integer id;
    private String name;
    private String env;
    private String timestamp;
    private String technology;
    private String username;
    private String version;
    private String git_branch;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getGit_branch() {
        return git_branch;
    }

    public void setGit_branch(String git_branch) {
        this.git_branch = git_branch;
    }

    public Service() {

    }
    public Service(Integer id,String name, String env, String timestamp, String technology, String username, String version, String git_branch) {
        this.id=id;
        this.name = name;
        this.env = env;
        this.timestamp = timestamp;
        this.technology = technology;
        this.username = username;
        this.version = version;
        this.git_branch = git_branch;

    }
}
