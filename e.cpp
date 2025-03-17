#include <iostream>
#include <vector>
using namespace std;
struct Fecha{
    int dia;
    int mes;
    int ano;
};
struct Producto{
    int id;
    string nombre;
    bool promo;
    int cantidad;
    float precio;
    string categoria;
};
struct Pedido{
    string nombre;
    vector<Producto> plato;
    Fecha fecha;
    float total;
};

vector<Producto> ingresar_productos(){
    Producto producto;
    vector<Producto> productos;
    int i=0, cat;
    char ven;
    while(i<4){
        producto.id=i+1;
        cout<<"Ingrese nombre del producto"<<endl;
        cin>>producto.nombre;
        cout<<"Tiene promo? y/n"<<endl;
        cin>>ven;
        if(ven=='y'){
            producto.promo=true;
        }
        else if(ven=='n'){
            producto.promo=false;
        }
        cout<<"Ingrese el precio"<<endl;
        cin>>producto.precio;
        cout<<"Que es?"<<endl<<"1-Hamburguesa"<<endl<<"2-Bebida"<<endl<<"3-Postre"<<endl<<"4-Acompañamiento"<<endl;
        cin>>cat;
        switch(cat){
            case 1:
                producto.categoria = "Hamburguesa";
                break;
            case 2:
                producto.categoria = "Bebida";
                break;
            case 3:
                producto.categoria = "Postre";
                break;
            case 4:
                producto.categoria = "Acompañamiento";
                break;
            default:
                cout<<"Ingrese un valor valido"<<endl;
                break;
        }
        i++;
        productos.push_back(producto);
    }
    return productos;
}

void nuevo_pedido(vector<Pedido> &pedidos,vector<Producto> &productos){
    Pedido nuevop;
    Producto platop;
    bool salir=false;
    int idPl=1, indicePl, cantPl=0;
    cout<<"Por favor ingrese su nombre"<<endl;
    cin>>nuevop.nombre;
    while(salir==false){
        for(int i=0; i<productos.size();i++){
            if (productos[i].id==idPl){
                cout<<productos[i].id<<"-"<<productos[i].nombre<<" "<<productos[i].precio<<endl;
                idPl++;
                break;
            }
            else if (i==productos.size()-1){
                cout<<productos.size()+1<<"-Salir"<<endl;
                while(true){
                    cin>>indicePl;
                    if(indicePl==productos.size()+1){
                        if (cantPl==0){
                            cout<<"Por favor ingrese un plato"<<endl;
                        }
                        else{
                            salir=true;
                            break;
                        }
                    }
                    else if(indicePl<=productos.size()){
                        
                        platop.id=indicePl;
                        cout<<"Seleccione una cantidad"<<endl;
                        cin>>platop.cantidad;
                        for(int ii=0; ii<productos.size();ii++){
                            if (productos[ii].id==platop.id){
                                platop.nombre=productos[ii].nombre;
                                platop.precio=productos[ii].precio*platop.cantidad;
                                platop.categoria=productos[ii].categoria;
                                productos[ii].cantidad+=platop.cantidad;
                                if(productos[ii].promo==true){
                                    platop.precio=platop.precio-platop.precio*0.2;
                                }
                                nuevop.plato.push_back(platop);
                                
                            }
                        }
                        cantPl++;
                        break;
                    }
                    else{
                        cout<<"Ingrese un valor valido"<<endl;
                    }
                    
                }
                
                
                
            }
        }
    }
    pedidos.push_back(nuevop);
}

void mostrar_pedido(vector<Pedido> pedidos){
    for(int i=0;i<pedidos.size();i++){
        cout<<pedidos[i].nombre<<endl;
        for(int ii=0;ii<pedidos[i].plato.size();ii++){
            cout<<pedidos[i].plato[ii].nombre<<" "<<pedidos[i].plato[ii].categoria<<" "<<pedidos[i].plato[ii].cantidad<<" "<<pedidos[i].plato[ii].precio<<"$"<<endl;
        }
    }
}

void mostrar_productos(vector<Producto> &productos){
    int n = productos.size();
    Producto aux;
    for (int i = 0; i < n - 1; i++) {
        
        for (int j = 0; j < n - i - 1; j++) {
            
            if (productos[j].cantidad < productos[j + 1].cantidad){
                aux=productos[j+1];
                productos[j+1]=productos[j];
                productos[j]=aux;

            }
        }
    }
    for (int ii=0;ii<n;ii++){
        cout<<productos[ii].nombre<<" "<<productos[ii].precio<<"$"<<endl;
    }
}
int menu(){
    int indice=0;
    cout<<"1-Agregar pedido"<<endl<<"2-Mostrar pedidos"<<endl<<"3-Salir"<<endl;
    cin>>indice;
    return indice;
}
int main(){
    int indice;
    bool salir=false;
    vector<Pedido>pedidos;
    vector<Producto> productos;
    productos=ingresar_productos();
    while(salir==false){
        mostrar_productos(productos);
        indice=menu();
        switch(indice){
            case 1:
                nuevo_pedido(pedidos,productos);
                break;
            case 2:
                mostrar_pedido(pedidos);
                break;
            case 3:
                salir=true;
                break;
            default:
                cout<<"Por favor ingrese un valor valido"<<endl;
                break;
        }
    }
}