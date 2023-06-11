package com.eshop;

import com.eshop.dao.CategoryRepository;
import com.eshop.dao.ComputerRepository;
import com.eshop.dao.PhoneRepository;
import com.eshop.dao.PhoneRepositoryCustom;
import com.eshop.entity.Category;
import com.eshop.entity.Computer;
import com.eshop.entity.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Collection;
import java.util.List;


@SpringBootApplication
//@EnableJpaRepositories(basePackages = {"com.eshop.dao"})
public class EshopDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(EshopDbApplication.class, args);
    }

    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    PhoneRepository phoneRepository;
    @Autowired
    ComputerRepository computerRepository;
    @Bean
    public CommandLineRunner run() {
        CommandLineRunner clr = new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {

                /*Collection<Phone> list = phoneRepository.getAllByColor("red");
                System.out.println(list);*/
                //List<Computer> listi = computerRepository.findAllByBrand("acer");
                //Computer c = listi.get(0);
                //c.setBrand("asus");
                Computer c1 =new Computer(2,"acer","black",16,new Category(3));
                 computerRepository.updateComputer(c1);
                // computerRepository.addComputer(c1);
                /* Phone phone = new Phone(null,"samsung","blue",6,new Category(1));
                phoneRepository.addPhone(phone);*/
               // List<Computer> list = computerRepository.findAllByBrand("acer");
               // System.out.println(list);

            }
        };
        return clr;
    }
}
