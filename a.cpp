#include <iostream>
#include <vector>
using namespace std;

struct Fecha{
    int dia;
    int mes;
    int ano;
};
struct Empleado{
    string nombre;
    string apellido;
    Fecha nacimiento;
    char sexo;
    float salario;
};
Empleado empleadoConMayorSueldo(vector<Empleado> empleados, vector<Empleado> &empleadospobres){
    Empleado mejor;
    for(int i=0;i<empleados.size();i++){
        if (empleados[i].salario>400000){
            if (empleados[i].salario>mejor.salario){
                mejor=empleados[i];
            }
        }
        else {
            empleadospobres.push_back(empleados[i]);
        }
    }
    return mejor;
}

int main(){
    Empleado e1;
    Empleado e2;
    Empleado e3;
    Empleado e4;
    Empleado e5;
    Empleado mejor;
    e1.nombre="Carlos";
    e1.apellido="Ramirez";
    e1.nacimiento.dia=3;
    e1.nacimiento.mes=3;
    e1.nacimiento.ano=1984;
    e1.sexo='m';
    e1.salario=500000;
    e2.nombre="Ramiro";
    e2.apellido="Gutierrez";
    e2.nacimiento.dia=3;
    e2.nacimiento.mes=3;
    e2.nacimiento.ano=1984;
    e2.sexo='m';
    e2.salario=400000;
    e3.nombre="Pedro";
    e3.apellido="Gonzalez";
    e3.nacimiento.dia=3;
    e3.nacimiento.mes=3;
    e3.nacimiento.ano=1984;
    e3.sexo='m';
    e3.salario=600000;
    e4.nombre="Fabrizio";
    e4.apellido="Gimenez";
    e4.nacimiento.dia=3;
    e4.nacimiento.mes=3;
    e4.nacimiento.ano=1984;
    e4.sexo='m';
    e4.salario=350000;
    e5.nombre="Humberto";
    e5.apellido="Lopez";
    e5.nacimiento.dia=3;
    e5.nacimiento.mes=3;
    e5.nacimiento.ano=1984;
    e5.sexo='m';
    e5.salario=800000;
    vector<Empleado> empresa;
    vector<Empleado> empresapobre;
    empresa.push_back(e1);
    empresa.push_back(e2);
    empresa.push_back(e3);
    empresa.push_back(e4);
    empresa.push_back(e5);
    mejor=empleadoConMayorSueldo(empresa,empresapobre);
    cout<<mejor.nombre<<" "<<mejor.apellido<<", "<<mejor.nacimiento.dia<<"/"<<mejor.nacimiento.mes<<"/"<<mejor.nacimiento.ano<<", "<<mejor.sexo<<", "<<mejor.salario<<endl;
    for(int i=0;i<empresapobre.size();i++){
        cout<<empresapobre[i].nombre<<" "<<empresapobre[i].apellido<<", "<<empresapobre[i].nacimiento.dia<<"/"<<empresapobre[i].nacimiento.mes<<"/"<<empresapobre[i].nacimiento.ano<<", "<<empresapobre[i].sexo<<", "<<empresapobre[i].salario<<endl;
    }
}