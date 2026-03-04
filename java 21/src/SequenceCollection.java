import java.util.ArrayList;
import java.util.List;

void main(){
    List<String> list = new ArrayList<>();
    list.add("2");
    list.add("3");
    list.addFirst("First Element");
    list.addLast("Last Element");
    list.forEach(System.out::println);


}