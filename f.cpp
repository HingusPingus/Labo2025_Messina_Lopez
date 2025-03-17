#include <iostream>
#include <vector>
using namespace std;

struct Fecha{
    int dia;
    int mes;
    int año;
};
struct Jugador{
    string nombre;
    int camiseta_num;
};
struct Equipo{
    string nombre;
    vector<Jugador> jugadores;
    int g_contra;
    int g_fav;
    char hist;
};
struct Partido{
    string equipo_vis;
    string equipo_loc;
    int goles_vis;
    int goles_loc;
    Fecha fecha;
    string estadio;
};

vector<Partido> partido_jugado(vector<Partido> &partidos){
    cout<<"ingresar nombre de los equipos"<<endl;
    cout<<"equipo visitante"<<endl;
    cin>>partidos.
}

int main(){
    Equipo equipo;
    vector<Equipo> equipos;
    int loop=0;
    while(loop<25){
        cout<<"ingresar nombre del equipo"<<endl;
        cin>>equipo.nombre;
        cout<<"ingresar jugadores"<<endl;
        int i=0;
        while(equipo.jugadores.size()<11){
            if(i==0){
                cout<<"ingrese arquero"<<endl;
                cout<<"nombre"<<endl;
                cin>>equipo.jugadores[i].nombre;
                cout<<"numero de camiseta"<<endl;
                cin>>equipo.jugadores[i].camiseta_num;
            }
            else{
                cout<<"ingrese jugador"<<endl;
                cout<<"nombre"<<endl;
                cin>>equipo.jugadores[i].nombre;
                cout<<"numero de camiseta"<<endl;
                cin>>equipo.jugadores[i].camiseta_num;
            }
            i++;
        }
        loop++;
    }
}