package com.example.boxergame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
Button adddata,viewdata,button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,viewanayalatics;
LinearLayout numebrpad,data,analytics;
TextView prevdata,text0,text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,anaylitics1,anaylitics2,anaylitics3,anaylitics4;
    ArrayList<Integer> realarray = new ArrayList<Integer>();
    ArrayList<Integer> disaplayarray = new ArrayList<Integer>();
    ArrayList<Integer> distancearray = new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adddata=findViewById(R.id.adddata);
        viewanayalatics=findViewById(R.id.viewanayalatics);
text0=findViewById(R.id.text0);
        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);
        anaylitics1=findViewById(R.id.anaylitics1);
        anaylitics3=findViewById(R.id.anaylitics3);
        anaylitics4=findViewById(R.id.anaylitics4);
        text3=findViewById(R.id.text3);
        text4=findViewById(R.id.text4);
        text5=findViewById(R.id.text5);
        text6=findViewById(R.id.text6);
        text7=findViewById(R.id.text7);
        text8=findViewById(R.id.text8);
        text9=findViewById(R.id.text9);
        analytics=findViewById(R.id.analytics);

        anaylitics2=findViewById(R.id.anaylitics2);








        button0=findViewById(R.id.button0);

        button1=findViewById(R.id.button1);

        button2=findViewById(R.id.button2);

        button3=findViewById(R.id.button3);

        button4=findViewById(R.id.button4);

        button5=findViewById(R.id.button5);

        button6=findViewById(R.id.button6);

        button7=findViewById(R.id.button7);

        button8=findViewById(R.id.button8);
        button9=findViewById(R.id.button9);



        prevdata=findViewById(R.id.prevdata);
        data=findViewById(R.id.data);
        viewdata=findViewById(R.id.viewdata);
        numebrpad=findViewById(R.id.numebrpad);
        adddata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numebrpad.setVisibility(View.VISIBLE);
                adddata.setVisibility(View.GONE);
                viewdata.setVisibility(View.VISIBLE);
                analytics.setVisibility(View.GONE);
                data.setVisibility(View.GONE);
                viewanayalatics.setVisibility(View.VISIBLE);
                setprevdata();
            }
        });
        viewdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numebrpad.setVisibility(View.GONE);
                adddata.setVisibility(View.VISIBLE);
                viewdata.setVisibility(View.GONE);
                giveDisplayData();
                analytics.setVisibility(View.GONE);
                data.setVisibility(View.VISIBLE);
                viewanayalatics.setVisibility(View.VISIBLE);
                setprevdata();
            }
        });

        viewanayalatics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numebrpad.setVisibility(View.GONE);
                adddata.setVisibility(View.VISIBLE);
                viewdata.setVisibility(View.VISIBLE);
                viewanayalatics.setVisibility(View.GONE);
                giveAnayaticsData();
                giveAnayaticsData2();
                analytics.setVisibility(View.VISIBLE);
                data.setVisibility(View.GONE);
                setprevdata();
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             realarray.add(0);
                setprevdata();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                realarray.add(1);
                setprevdata();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                realarray.add(2);
                setprevdata();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                realarray.add(3);
                setprevdata();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                realarray.add(4);
                setprevdata();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                realarray.add(5);
                setprevdata();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                realarray.add(6);
                setprevdata();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                realarray.add(7);
                setprevdata();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                realarray.add(8);
                setprevdata();
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                realarray.add(9);
                setprevdata();
            }
        });
    }

void giveAnayaticsData(){
        int large0=-1,small0=0,large1=-1,small1=0, large2=-1,small2=0,large3=-1,small3=0,large4=-1,small4=0,large5=-1,small5=0,large6=-1,small6=0,large7=-1,small7=0,large8=-1,small8=0,large9=-1,small9=0;
        int distance0=0,c0,largev=-1,smallv=0,distancev=0,cv;
    int distance1=0,c1;
    int distance2=0,c2;
    int distance3=0,c3;
    int distance4=0,c4;
    int distance5=0,c5;
    int distance6=0,c6;
    int distance7=0,c7;
    int distance8=0,c8;
    int distance9=0,c9;
        disaplayarray.clear();
    for (int i =realarray.size() - 1; i >= 0; i--) {

            disaplayarray.add(realarray.get(i));


    }




    for(int i=0;i<realarray.size();i++){
        if(realarray.get(i)==0){
        if(large0==-1){
            large0=i;
            small0=i;
            distance0=0;
        }else{
    large0=i;
    c0=large0-small0;
    if(c0>distance0){
    distance0=large0-small0;}
    small0=large0;
        }}

        if(realarray.get(i)==1){
            if(large1==-1){
                large1=i;
                small1=i;
                distance1=0;
            }else{
                large1=i;
                c1=large1-small1;
                if(c1>distance1){
                    distance1=large1-small1;}
                small1=large1;
            }}
        if(realarray.get(i)==2){
            if(large2==-1){
                large2=i;
                small2=i;
                distance2=0;
            }else{
                large2=i;
                c2=large2-small2;
                if(c2>distance2){
                    distance2=large2-small2;}
                small2=large2;
            }}
        if(realarray.get(i)==3){
            if(large3==-1){
                large3=i;
                small3=i;
                distance3=0;
            }else{
                large3=i;
                c3=large3-small3;
                if(c3>distance3){
                    distance3=large3-small3;}
                small3=large3;
            }}
        if(realarray.get(i)==4){
            if(large4==-1){
                large4=i;
                small4=i;
                distance4=0;
            }else{
                large4=i;
                c4=large4-small4;
                if(c4>distance4){
                    distance4=large4-small4;}
                small4=large4;
            }}
        if(realarray.get(i)==5){
            if(large5==-1){
                large5=i;
                small5=i;
                distance5=0;
            }else{
                large5=i;
                c5=large5-small5;
                if(c5>distance5){
                    distance5=large5-small5;}
                small5=large5;
            }}
        if(realarray.get(i)==6){
            if(large6==-1){
                large6=i;
                small6=i;
                distance6=0;
            }else{
                large6=i;
                c6=large6-small6;
                if(c6>distance6){
                    distance6=large6-small6;}
                small6=large6;
            }}
        if(realarray.get(i)==7){
            if(large7==-1){
                large7=i;
                small7=i;
                distance7=0;
            }else{
                large7=i;
                c7=large7-small7;
                if(c7>distance7){
                    distance7=large7-small7;}
                small7=large7;
            }}
        if(realarray.get(i)==8){
            if(large8==-1){
                large8=i;
                small8=i;
                distance8=0;
            }else{
                large8=i;
                c8=large8-small8;
                if(c8>distance8){
                    distance8=large8-small8;}
                small8=large8;
            }}
        if(realarray.get(i)==9){
            if(large9==-1){
                large9=i;
                small9=i;
                distance9=0;
            }else{
                large9=i;
                c9=large9-small9;
                if(c9>distance9){
                    distance9=large9-small9;}
                small9=large9;
            }}

        if(realarray.get(i)==5||realarray.get(i)==0){
            if(largev==-1){
                largev=i;
                smallv=i;
                distancev=0;
            }else{
                largev=i;
                cv=largev-smallv;
                if(cv>distancev){
                    distancev=largev-smallv;}
                smallv=largev;
            }}
    }
    distancearray.clear();
    distancearray.add(distance0);
    distancearray.add(distance1);
    distancearray.add(distance2);
    distancearray.add(distance3);
    distancearray.add(distance4);
    distancearray.add(distance5);
    distancearray.add(distance6);
    distancearray.add(distance7);
    distancearray.add(distance8);
    distancearray.add(distance9);
    int top=0,topindex=0;
    for(int i=0;i<distancearray.size();i++){

        if(distancearray.get(i)>top){
            top=distancearray.get(i);
            topindex=i;
        }
    }

    anaylitics1.setText("maximum distance"+String.valueOf(top-1)+"-"+String.valueOf(topindex)+"["+0+"-"+String.valueOf(distance0-1)+"]"
            +"["+1+"-"+String.valueOf(distance1-1)+"]"
            +"["+2+"-"+String.valueOf(distance2-1)+"]"
            +"["+3+"-"+String.valueOf(distance3-1)+"]"
            +"["+4+"-"+String.valueOf(distance4-1)+"]"
            +"["+5+"-"+String.valueOf(distance5-1)+"]"
            +"["+6+"-"+String.valueOf(distance6-1)+"]"
            +"["+7+"-"+String.valueOf(distance7-1)+"]"
            +"["+8+"-"+String.valueOf(distance8-1)+"]"
            +"["+9+"-"+String.valueOf(distance9-1)+"]"

    );

    anaylitics2.setText("voilet distance"+String.valueOf(distancev-1));

}

void giveAnayaticsData2(){
        String a0="",a1="",a2="",a3="",a4="",a5="",a6="",a7="",a8="",a9="",last="";
        int last2,last1;
        last1=realarray.get((realarray.size()-1));
                last2=realarray.get((realarray.size()-2));
    for(int i=0;i<realarray.size()-2;i++){
        if(realarray.get(i)==last2&&realarray.get(i+1)==last1){
            last=last+String.valueOf(realarray.get(i+2));
        }
        if(realarray.get(i)==0&&realarray.get(i+1)==0){
            a0=a0+String.valueOf(realarray.get(i+2));
        }
        if(realarray.get(i)==1&&realarray.get(i+1)==1){
            a1=a1+String.valueOf(realarray.get(i+2));
        }
        if(realarray.get(i)==2&&realarray.get(i+1)==2){
            a2=a2+String.valueOf(realarray.get(i+2));
        }
        if(realarray.get(i)==3&&realarray.get(i+1)==3){
            a3=a3+String.valueOf(realarray.get(i+2));
        }
        if(realarray.get(i)==4&&realarray.get(i+1)==4){
            a4=a4+String.valueOf(realarray.get(i+2));
        }
        if(realarray.get(i)==5&&realarray.get(i+1)==5){
            a5=a5+String.valueOf(realarray.get(i+2));
        }
        if(realarray.get(i)==6&&realarray.get(i+1)==6){
            a6=a6+String.valueOf(realarray.get(i+2));
        }
        if(realarray.get(i)==7&&realarray.get(i+1)==7){
            a7=a7+String.valueOf(realarray.get(i+2));
        }
        if(realarray.get(i)==8&&realarray.get(i+1)==8){
            a8=a8+String.valueOf(realarray.get(i+2));
        }
        if(realarray.get(i)==9&&realarray.get(i+1)==9){
            a9=a9+String.valueOf(realarray.get(i+2));
        }



    }


    anaylitics3.setText("data comes"+
                    "["+00+"-"+String.valueOf(a0)+"]"

           + "["+11+"-"+String.valueOf(a1)+"]"
            +"["+22+"-"+String.valueOf(a2)+"]"
            +"["+33+"-"+String.valueOf(a3)+"]"
            +"["+44+"-"+String.valueOf(a4)+"]"
            +"["+55+"-"+String.valueOf(a5)+"]"
            +"["+66+"-"+String.valueOf(a6)+"]"
            +"["+77+"-"+String.valueOf(a7)+"]"
            +"["+88+"-"+String.valueOf(a8)+"]"
            +"["+99+"-"+String.valueOf(a9)+"]"

    );

    anaylitics4.setText("lastcomes"+"["+String.valueOf(last2)+String.valueOf(last1)+"-"+String.valueOf(last)+"]");
}
void giveDisplayData(){
    if(realarray.size()!=0) {
        int j = 0;
        Boolean a0 = false, a1 = false, a2 = false, a3 = false, a4 = false, a5 = false, a6 = false, a7 = false, a8 = false, a9 = false;
        for (int i = realarray.size() - 1; i >= 0; i--) {

            if (realarray.get(i) == 0 && a0 == false) {
                text0.setText("O comes before " + String.valueOf(j));
                a0=true;
            }
            if (realarray.get(i) == 1 && a1 == false) {
                text1.setText("1 comes before " + String.valueOf(j));
                a1=true;
            }
            if (realarray.get(i) == 2 && a2 == false) {
                text2.setText("2 comes before " + String.valueOf(j));
                a2=true;
            }
            if (realarray.get(i) == 3 && a3 == false) {
                text3.setText("3 comes before " + String.valueOf(j));
                a3=true;
            }
            if (realarray.get(i) == 4 && a4 == false) {
                text4.setText("4 comes before " + String.valueOf(j));
                a4=true;
            }
            if (realarray.get(i) == 5 && a5 == false) {
                text5.setText("5 comes before " + String.valueOf(j));
                a5=true;
            }
            if (realarray.get(i) == 6 && a6 == false) {
                text6.setText("6 comes before " + String.valueOf(j));
                a6=true;
            }
            if (realarray.get(i) == 7 && a7 == false) {
                text7.setText("7 comes before " + String.valueOf(j));
                a7=true;
            }
            if (realarray.get(i) == 8 && a8 == false) {
                text8.setText("8 comes before " + String.valueOf(j));
                a8=true;
            }
            if (realarray.get(i) == 9 && a9 == false) {
                text9.setText("9 comes before " + String.valueOf(j));
                a9=true;
            }
            j++;
        }


    }





}

   void setprevdata(){
        String a="";
        if(realarray.size()!=0){
            for(int i=realarray.size()-1;i>=0;i--){
            a=a+String.valueOf(realarray.get(i))+ ',';
        }}

       prevdata.setText(a);
        adddata.setText("ADD DATA"+String.valueOf(realarray.size()));
       viewdata.setText("VIEW DATA"+String.valueOf(realarray.size()));
    }
}