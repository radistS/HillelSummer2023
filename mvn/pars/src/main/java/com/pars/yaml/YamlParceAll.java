package com.pars.yaml;

import com.pars.ReadFromFile;
import com.pars.UserExt;
import com.pars.UserFull;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

public class YamlParceAll {
    public static void main(String[] args) {
        Yaml yaml = new Yaml(new Constructor(UserFull.class));
        String yamlStr = ReadFromFile.readToString("/Users/oleksandrstepurko/IdeaProjects/HillelSummer2023/mvn/pars/src/main/resources/userClassIm.yaml");
        UserExt user = yaml.load(yamlStr);
        System.out.println(user);
        System.out.println("--------");
        System.out.println(yaml.dump(user));
    }
}
