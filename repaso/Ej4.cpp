#include <iostream>
#include <vector>
using namespace std;

struct Fecha{
    int dia;
    int mes;
    int año;
};
struct Paciente{
    string nombre;
    int edad;
    int num_hist;
    Fecha cita;
};

void cancel(vector<Paciente> pacientes){
    int num;
    cout<<"Ingrese numero de historia clinica del paciente"<<endl;
    cin>>num;
    for(int i=0;i<pacientes.size();i++){
        if(pacientes[i].num_hist==num){
            pacientes[i].cita.año==0;
            pacientes[i].cita.dia==0;
            pacientes[i].cita.mes==0;
        }
    }
}
void citas_programadas(vector<Paciente> pacientes){
    Fecha fecha;
    vector<Paciente> citas_hoy;
    cout<<"ingrese la fecha"<<endl;
    cout<<"dia"<<endl;
    cin>>fecha.dia;
    cout<<"mes"<<endl;
    cin>>fecha.mes;
    cout<<"año"<<endl;
    cin>>fecha.año;
    for(int i=0;i<pacientes.size();i++){
        if(pacientes[i].cita.año==fecha.año and pacientes[i].cita.mes==fecha.mes and pacientes[i].cita.dia==fecha.dia){
            citas_hoy.push_back(pacientes[i]);
        }
    }
    cout<<"pacientes del dia"<<endl;
    for(int j=0;j<citas_hoy.size();j++){
        cout<<j+1<<" ";
        cout<<citas_hoy[j].nombre<<endl;
        cout<<citas_hoy[j].edad<<endl;
        cout<<citas_hoy[j].num_hist<<endl;
        cout<<endl;
    }
}
void ver_paciente(vector<Paciente> pacientes){
    int num;
    cout<<"ingrese numero de paciente"<<endl;
    cin>>num;
    for(int j=0;j<pacientes.size();j++){
        if(pacientes[j].num_hist==num){
        cout<<j+1<<endl;
        cout<<pacientes[j].nombre<<endl;
        cout<<pacientes[j].edad<<endl;
        cout<<pacientes[j].num_hist<<endl;
        cout<<endl;
        }
    }
}

int main(){
    Paciente paciente;
    vector<Paciente> pacientes;
    string ans;
    while(ans=="si"){
        cout<<"ingrese nombre del paciente"<<endl;
        cin>>paciente.nombre;
        cout<<"ingrese edad del paciente"<<endl;
        cin>>paciente.edad;
        cout<<"ingrese numero de historia clinica del paciente"<<endl;
        cin>>paciente.num_hist;
        cout<<"ingrese fecha de cita del paciente"<<endl;
        cout<<"dia"<<endl;
        cin>>paciente.cita.dia;
        cout<<"mes"<<endl;
        cin>>paciente.cita.mes;
        cout<<"año"<<endl;
        cin>>paciente.cita.año;
        pacientes.push_back(paciente);
        cout<<"quiere ingresar otro paciente? si/no"<<endl;
        cin>>ans;
    }
    string ans2;
    cout<<"quiere cancelar una cita? si/no"<<endl;
    cin>>ans2;
    if(ans2=="si"){
        cancel(pacientes);
    }
    string ans3;
    cin>>ans3;
    cout<<"quiere ver los pacientes de una fecha especifica? si/no"<<endl;
    if(ans3=="si"){
        citas_programadas(pacientes);
    }
    string ans4;
    cout<<"quiere buscar un paciente? si/no"<<endl;
    cin>>ans4;
    if(ans4=="si"){
        ver_paciente(pacientes);
    }
}
