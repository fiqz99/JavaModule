package com.balloon.demo.sevice;

import org.springframework.stereotype.Service;

@Service

public class BallonService {
    public static int solution(String s){
        //B A L L O O N
        int length = s.length();
        int bCounter =0;
        int aCounter =0;
        int lCounter =0;
        int oCounter =0;
        int nCounter =0;
        for (int i =0; i<length; i++){
            if (s.charAt(i) == 'B'){
                bCounter++;
            }
            else if (s.charAt(i) == 'A'){
                aCounter++;
            }
            else if (s.charAt(i) == 'L'){
                lCounter++;
            }
            else if (s.charAt(i) == 'O'){
                oCounter++;
            }
            else if (s.charAt(i) == 'N'){
                nCounter++;
            }
            else {
                continue;
            }
        }
        return Math.min(Math.min(bCounter,aCounter),Math.min(nCounter, Math.min(lCounter/2, oCounter/2)));
    }
}
