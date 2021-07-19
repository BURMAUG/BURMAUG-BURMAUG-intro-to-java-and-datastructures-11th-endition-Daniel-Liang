package chapt17;

import java.io.*;
import java.util.Arrays;
import java.util.List;

/*****  binary IO
 *
 * 17.1 create a txt file and the populate it with number from 0-100
 *
 ***/
public class FileManager {
    private String customerName;
    private int age;
    private String address;
    private int zip;
    private String city;

    public FileManager(String customerName, int age, String address, int zip, String city) {
        this.customerName = customerName;
        this.age = age;
        this.address = address;
        this.zip = zip;
        this.city = city;
    }

    public FileManager() {
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "FileManager{" +
                "customerName='" + customerName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", zip=" + zip +
                ", city='" + city + '\'' +
                '}';
    }

    public static void main(String[] args) throws IOException {
        FileManager jame = new FileManager("burmau", 40, "asdjasldc;as asdhasd",23937, "cold spring");
        FileManager jae = new FileManager("Jae", 33, "asdjasldc;as asdhasd",2937, "cold spring");
        FileManager james = new FileManager("james", 323, "asdjasldc;as asdhasd",23937, "cold spring");
        FileManager low = new FileManager("low", 23, "asdjasldc;as asdhasd",23937, "cold spring");
        List<FileManager> list = Arrays.asList(jae, jame, low, james);

        list.stream().filter(lists -> lists.getAge() > 30).forEach(System.out::println);
    }
}
