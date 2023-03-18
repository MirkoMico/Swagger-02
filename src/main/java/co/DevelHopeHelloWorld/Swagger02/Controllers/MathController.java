package co.DevelHopeHelloWorld.Swagger02.Controllers;

import co.DevelHopeHelloWorld.Swagger02.ArithmeticOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {
    private ArithmeticOperation arithmeticOperation;
    @GetMapping("/")
        public String welcomeMathMsg(){
        System.out.println("welcome message");
            return "welcome Math!!!!!!!";
        }
        @GetMapping("/ok")
        public ArithmeticOperation get(){
        return arithmeticOperation;
        }

        @PostMapping("/division-info")
            public ResponseEntity division(@RequestBody ArithmeticOperation arithmeticOperation){
            System.out.println("division information method");
            this.arithmeticOperation=arithmeticOperation;
             return new ResponseEntity(HttpStatus.CREATED);
                }
                @GetMapping ("/multiplication")
                public int multiplication(@RequestParam int a, int b){
                int c=a*b;
                    System.out.println("method for multiplication");
                return c;
                }
                @GetMapping("/square/{n}")
                public int square(@PathVariable int n){
                    System.out.println("method for square root");
                int rad= (int) Math.sqrt(n);
                return rad;
                }
    }
