package com.redbee.clase5.ejercicios;

import org.springframework.validation.ObjectError;

import javax.sound.midi.SysexMessage;
import javax.swing.plaf.synth.SynthMenuBarUI;
import java.util.Objects;
import java.lang.String;

public class CalculadoraString {

    public static Integer calcula(String input) {
        Integer result = 0;
        if (Objects.equals(input, "") || input == null) {
            return result;
        }else if (input.length() == 1) {
            return Integer.parseInt(input);
        }else{
            String operators[]=input.split("[0-9]+");
            String operands[]=input.split("[+-]");
            result = Integer.parseInt(operands[0]);
            for(int i=1;i<operands.length;i++){
                if(operators[i].equals("+"))
                    result += Integer.parseInt(operands[i]);
                else
                    result -= Integer.parseInt(operands[i]);
            }if(result < 0){ result *= -1;}
        }
        return result;
    }

}
