package whalewarehouse;

import controllers.ShoeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WhaleWarehouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(WhaleWarehouseApplication.class, args);
    }

    @Bean
    CommandLineRunner initDataBase(ShoeRepository shoeRepository) {
        return args -> {
            shoeRepository.deleteAll();

            Shoe shoe = new Shoe();
            shoe.setDescription("Adidas Adilete");
            shoe.setBarCode("78998723782");

            shoeRepository.save(shoe);
        };

    }

}
