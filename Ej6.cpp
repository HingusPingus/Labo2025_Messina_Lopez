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
    vector<char> hist;
};
struct Partido{
    string equipo_vis;
    string equipo_loc;
    int goles_vis;
    int goles_loc;
    Fecha fecha;
    string estadio;
};
void mostrar_partido(vector<Partido> partidos, vector<Equipo> equipos){
    string equipo_vis;
    string equipo_loc;
    bool a=true;
    string name1;
    while(a==true){
        cout<<"ingrese nombre de equipo visitante valido"<<endl;
        cin>>name1;
        for(int i=0;i<equipos.size();i++){
            if(name1==equipos[i].nombre){
                name1=equipo_vis;
                a=false;
            }
        }
    }
    bool b=true;
    string name2;
    while(b==true){
        cout<<"ingrese nombre de equipo local valido"<<endl;
        cin>>name2;
        for(int j=0;j<equipos.size();j++){
            if(name2==equipos[j].nombre){
                name2=equipo_loc;
                b=false;
            }
        }
    }
    for(int q=0;q<partidos.size();q++){
        if(equipo_loc==partidos[q].equipo_loc and equipo_vis==partidos[q].equipo_vis){
            cout<<"informacion del partido:"<<endl;
            cout<<"equipo visitante: "<<partidos[q].equipo_vis<<"."<<endl;
            cout<<"goles visitantes: "<<partidos[q].goles_vis<<"."<<endl;
            cout<<"goles locales: "<<partidos[q].goles_loc<<"."<<endl;
            cout<<"fecha: "<<partidos[q].fecha.dia<<"/"<<partidos[q].fecha.mes<<"/"<<partidos[q].fecha.año<<endl;
            cout<<"estadio: "<<partidos[q].estadio<<"."<<endl;
        }
    }
}
vector<Partido> partido_jugado(vector<Equipo> &equipos){
    vector<Partido> partidos;
    Partido partido;
    char loop='y';
    while(loop=='y'){
        cout<<"ingresar nombre de los equipos"<<endl;
        cout<<"equipo visitante"<<endl;
        //se fija que los nombres puestos sean iguales a los de los equipos.
        bool a=true;
        string name1;
        while(a==true){
            cin>>name1;
            for(int i=0;i<equipos.size();i++){
                if(name1==equipos[i].nombre){
                    name1=partido.equipo_vis;
                    a=false;
                }
            }
        }
        bool b=true;
        string name2;
        while(b==true){
            cin>>name2;
            for(int j=0;j<equipos.size();j++){
                if(name2==equipos[j].nombre){
                    name2=partido.equipo_loc;
                    b=false;
                }
            }
        }
        cout<<"goles visitantes"<<endl;
        cin>>partido.goles_vis;
        cout<<"goles locales"<<endl;
        cin>>partido.goles_loc;
        cout<<"fecha del partido"<<endl;
        cout<<"dia"<<endl;
        cin>>partido.fecha.dia;
        cout<<"mes"<<endl;
        cin>>partido.fecha.mes;
        cout<<"año"<<endl;
        cin>>partido.fecha.año;
        cout<<"estadio"<<endl;
        cin>>partido.estadio;
        partidos.push_back(partido);
        if(partido.goles_loc>partido.goles_vis){
            for(int ii=0;ii<equipos.size();ii++){
                if(partido.equipo_loc==equipos[ii].nombre){
                    equipos[ii].hist.push_back('V');
                }
                if(partido.equipo_vis==equipos[ii].nombre){
                    equipos[ii].hist.push_back('L');
                }
            }
        }
        else if(partido.goles_vis>partido.goles_loc){
            for(int jj=0;jj<equipos.size();jj++){
                if(partido.equipo_vis==equipos[jj].nombre){
                    equipos[jj].hist.push_back('V');
                }
                if(partido.equipo_loc==equipos[jj].nombre){
                    equipos[jj].hist.push_back('L');
                }
            }
        }
        else if(partido.goles_vis==partido.goles_loc){
            for(int q=0;q<equipos.size();q++){
                if(partido.equipo_vis==equipos[q].nombre or partido.equipo_loc==equipos[q].nombre){
                    equipos[q].hist.push_back('D');
                }
            }
        }
        cout<<"añadir otro partido? y/n"<<endl;
        cin>>loop;
    }
    return partidos;
}
void tabla (vector<Equipo> equipos){
    
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
