#include <stdio.h>
#include <conio.h>

main ()
{
	float tempc, tempf;

	       printf("*Programa em C para converter graus Celsios em Fahrenheit*\n");

           printf("\nInforme a temperatura em graus Celsius:  ");
           scanf("%f",&tempc);

    tempf =(9*tempc+160)/5;

           printf("\nA temperatura em graus Fahrenheit e: %.2f \n ", tempf);

  getch();
}

