#include <iostream>
#include <vector>
using namespace std;

struct Piloto{
    string nombre;
    int numeroAuto;
    string equipo;
    int arranque;
    int fin;
};
struct Vuelta_rapida {
    int numero_vuelta;
    int tiempo;
    string nombre_piloto;
};
      
struct Equipo {
    string nombre;
    int puntos;
};

vector<Piloto> cargar_datos_pilotos(){
    vector<Piloto> pilotos = {
        {"Lando Norris", 4, "McLaren Formula 1 Team",0,0},
        {"Oscar Piastri", 81, "McLaren Formula 1 Team",0,0},
        {"Charles Leclerc", 16, "Scuderia Ferrari HP",0,0},
        {"Lewis Hamilton", 44, "Scuderia Ferrari HP",0,0},
        {"Max Verstappen", 1, "Oracle Red Bull Racing",0,0},
        {"Liam Lawson", 30, "Oracle Red Bull Racing",0,0},
        {"Andrea Kimi Antonelli", 12, "Mercedes-AMG PETRONAS Formula One Team",0,0},
        {"George Russell", 63, "Mercedes-AMG PETRONAS Formula One Team",0,0},
        {"Fernando Alonso", 14, "Aston Martin Aramco Formula One Team",0,0},
        {"Lance Stroll", 18, "Aston Martin Aramco Formula One Team",0,0},
        {"Jack Doohan", 7, "BWT Alpine Formula 1 Team",0,0},
        {"Pierre Gasly", 10, "BWT Alpine Formula 1 Team",0,0},
        {"Esteban Ocon", 31, "MoneyGram Haas F1 Team",0,0},
        {"Oliver Bearman", 87, "MoneyGram Haas F1 Team",0,0},
        {"Isack Hadjar", 6, "Visa Cash App Racing Bulls Formula One Team",0,0},
        {"Yuki Tsunoda", 22, "Visa Cash App Racing Bulls Formula One Team",0,0},
        {"Alexander Albon", 23, "Atlassian Williams Racing",0,0},
        {"Carlos Sainz Jr.", 55, "Atlassian Williams Racing",0,0},
        {"Gabriel Bortoleto", 5, "Stake F1 Team Kick Sauber",0,0},
        {"Nico Hülkenberg", 27, "Stake F1 Team Kick Sauber",0,0}
    };
    return pilotos;
}
vector<Equipo> cargar_datos_equipos(){
    vector<Equipo>equipos={
        {"McLaren Formula 1 Team",0},
        {"Scuderia Ferrari HP",0},
        {"Oracle Red Bull Racing",0},
        {"Mercedes-AMG PETRONAS Formula One Team",0},
        {"Aston Martin Aramco Formula One Team",0},
        {"BWT Alpine Formula 1 Team",0},
        {"MoneyGram Haas F1 Team",0},
        {"Visa Cash App Racing Bulls Formula One Team",0},
        {"Atlassian Williams Racing",0},
        {"Stake F1 Team Kick Sauber",0}
    };
    return equipos;
}

Vuelta_rapida cargar_datos_carrera(vector<Piloto> &pilotos){
    int aux=0;
    bool encontro=false;
    Vuelta_rapida vueltarapida;
    for(int i=0; i<20;i++){
        encontro=false;
        while(encontro==false){

            cout<<"seleccione el numero del "<<i+1<<"° puesto"<<endl;
            cin>>aux;
        
            for (int ii=0;ii<20;ii++){
                if (aux==pilotos[ii].numeroAuto){
                    pilotos[ii].fin=i+1;
                    encontro=true;
                }
            }
        }
    }
    cout<<"Quien hizo la vuelta rapida?"<<endl;
    cin>>vueltarapida.nombre_piloto;
    cout<<"Cuantos segundos fueron?"<<endl;
    cin>>vueltarapida.tiempo;
    cout<<"Que vuelta fue?"<<endl;
    cin>>vueltarapida.numero_vuelta;
    return vueltarapida;
}
void calcular_puntaje_piloto_equipo(vector<Equipo>&equipos, Vuelta_rapida vueltarapida,vector<Piloto>pilotos){
    vector<int> puntos={25,18,15,12,10,8,6,4,2,1,0,0,0,0,0,0,0,0,0,0};
    for (int i=0;i<20;i++){
        for (int ii=0;ii<20;ii++){
            if (pilotos[ii].fin==i+1){
                for(int iii=0;iii<10;iii++){
                    if(pilotos[ii].equipo==equipos[iii].nombre){
                        if(i<10 && pilotos[ii].nombre==vueltarapida.nombre_piloto){
                            equipos[iii].puntos+=puntos[i]+1;
                        }
                        else{
                            equipos[iii].puntos+=puntos[i];
                        }
                    }
                }
            }
        }
    }
}

void ordenar_tabla_equipos(vector<Equipo>&equipos){
    int n = equipos.size();
    Equipo aux;
    for (int i = 0; i < n - 1; i++) {
        
        for (int j = 0; j < n - i - 1; j++) {
            
            if (equipos[j].puntos < equipos[j + 1].puntos){
                aux=equipos[j+1];
                equipos[j+1]=equipos[j];
                equipos[j]=aux;

            }
        }
    }
}
void mostrar_tabla_equipos(vector<Equipo>equipos){
    int n = equipos.size();
    for (int ii=0;ii<n;ii++){
        cout<<equipos[ii].nombre<<" "<<equipos[ii].puntos<<" "<<endl;
    }
}

int main(){
    vector<Equipo> equipos=cargar_datos_equipos();
    vector<Piloto> pilotos=cargar_datos_pilotos();
    Vuelta_rapida vueltarapida;
    
    
    for (int i = 0; i < 24; i++){
       // 1
       vueltarapida=cargar_datos_carrera(pilotos);
       // 2
       calcular_puntaje_piloto_equipo(equipos, vueltarapida,pilotos);
    }
    // 3
    ordenar_tabla_equipos(equipos);
    mostrar_tabla_equipos(equipos);
}
