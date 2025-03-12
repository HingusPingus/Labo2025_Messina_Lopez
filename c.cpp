#include <iostream>
#include <vector>
using namespace std;

struct Plato{
    int id;
    string nombre;
    int cantidad;
    int precio;
};
struct Pedido{
    int numero;
    string nombre;
    vector<Plato> plato;
};

void nuevoPedido(vector<Pedido> &listaPe, vector<Plato> listaPl, int numeroP){
    Pedido nuevop;
    Plato platop;
    bool salir=false;
    int idPl=1, indicePl, cantPl=0;
    nuevop.numero=numeroP;
    cout<<"Por favor ingrese su nombre"<<endl;
    cin>>nuevop.nombre;
    while(salir==false){
        for(int i=0; i<listaPl.size();i++){
            if (listaPl[i].id==idPl){
                cout<<listaPl[i].id<<"-"<<listaPl[i].nombre<<" "<<listaPl[i].precio<<endl;
                idPl++;
                break;
            }
            else if (i==listaPl.size()-1){
                cout<<listaPl.size()+2<<"-Salir"<<endl;
                while(true){
                    cin>>indicePl;
                    if(indicePl==listaPl.size()+2){
                        if (cantPl==0){
                            cout<<"Por favor ingrese un plato"<<endl;
                        }
                        else{
                            salir=true;
                            break;
                        }
                    }
                    else{
                        
                        platop.id=indicePl;
                        cout<<"Seleccione una cantidad"<<endl;
                        cin>>platop.cantidad;
                        for(int ii=0; ii<listaPl.size();ii++){
                            if (listaPl[ii].id==platop.id){
                                platop.nombre=listaPl[ii].nombre;
                                platop.precio=listaPl[ii].precio*platop.cantidad;
                                nuevop.plato.push_back(platop);
                                cout<<"recopla"<<endl;
                                
                            }
                        }
                        cantPl++;
                        break;
                    }
                    
                }
                
                
                
            }
        }
    }
    listaPe.push_back(nuevop);
}

void cancelarPedido(vector<Pedido> &listaPe){

}

void mostrarPedido(vector<Pedido> listaPe){
    for(int i=0;i<listaPe.size();i++){
        cout<<listaPe[i].numero<<" "<<listaPe[i].nombre<<endl;
        for(int ii=0;ii<listaPe[i].plato.size();ii++){
            cout<<listaPe[i].plato[ii].id<<" "<<listaPe[i].plato[ii].nombre<<" "<<listaPe[i].plato[ii].cantidad<<" "<<listaPe[i].plato[ii].precio<<"$"<<endl;
        }
    }
}

void ingresoTotal(vector<Pedido> listaPe){

}

int menu(){
    int indice=0;
    cout<<"1-Agregar pedido"<<endl<<"2-Cancelar pedido"<<endl<<"3-Mostrar pedidos"<<endl<<"4-Calcular ingreso"<<endl<<"5-Salir"<<endl;
    cin>>indice;
    return indice;
}

int main(){
    bool salir=false;
    int indice=0, numeroP=1;
    vector<Pedido> listaPe;
    vector<Plato> listaPl;
    Plato pl1, pl2, pl3, pl4;
    pl1.id=1;
    pl1.nombre="Milanesa con Fritas";
    pl1.cantidad=1;
    pl1.precio=14000;
    pl2.id=2;
    pl2.nombre="Pizza grande Muzzarella";
    pl2.cantidad=1;
    pl2.precio=10000;
    pl3.id=3;
    pl3.nombre="Burga con Queso";
    pl3.cantidad=1;
    pl3.precio=8000;
    pl4.id=4;
    pl4.nombre="Patitas de Pollo";
    pl4.cantidad=1;
    pl4.precio=8000;
    listaPl.push_back(pl1);
    listaPl.push_back(pl2);
    listaPl.push_back(pl3);
    listaPl.push_back(pl4);
    while(salir==false){
        indice=menu();
        switch(indice){
            case 1:
                nuevoPedido(listaPe,listaPl,numeroP);
                numeroP++;
                break;
            case 2:
                cancelarPedido(listaPe);
                break;
            case 3:
                mostrarPedido(listaPe);
                break;
            case 4:
                ingresoTotal(listaPe);
                break;
            case 5:
                salir=true;
                break;
            default:
                cout<<"Por favor ingrese un valor valido"<<endl;
                break;
        }
    }
}