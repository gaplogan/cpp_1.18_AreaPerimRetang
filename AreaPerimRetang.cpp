#include <iostream>
#include <locale>
#include <cmath>

using namespace std;

int main()
{
    setlocale(LC_ALL, "Portuguese");

    // Declara��o de vari�veis do programa
    double lado1, lado2, perim, area;

    // {Entrada de dados}
    cout << "Digite o valor do primeiro lado: ";
    cin >> lado1;
    lado1 = abs(lado1); //garante Lado1 com valor positivo

    cout << "Digite o valor do segundo lado: ";
    cin >> lado2;
    lado2 = abs(lado2); //garante Lado2 com valor positivo

    cout << endl; // Salta uma linha

    // {Processamento de dados}
    perim = 2 * lado1 + 2 * lado2; //f�rmula do per�metro do ret�ngulo
    area = lado1 * lado2;

    // {Sa�da de dados}
    cout << "Per�metro: " << perim << endl;
    cout << "�rea.....: " << area << endl;

    return 0;
}