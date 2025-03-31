#include <iostream>
#include <vector>
using namespace std;
struct Producto{
    string nombre;
    int codigo_barra;
    string marca;
    float precio;
    bool fecha_ven;
};

int producto_mas_caro(Producto gondola[3][4]){
    int mas_caro=gondola[0][0].precio;
    for(int i=0;i<3;i++){
        for(int j=0;j<4;j++){
            if(gondola[i][j].precio>mas_caro){
                mas_caro=gondola[i][j].precio;
            }
            else{
                return j;
            }
        }
    }
}
float promedio(Producto gondola[3][4]){
    vector<float> avg;
    
    for(int i=0;i<3;i++){
        for(int j=0;j<4;j++){
            avg.push_back(gondola[i][j].precio);
        }
    }
    float a=avg[0];
    for(int ii=1;ii<avg.size();ii++){
        a=a+avg[ii];
    }
    a=a/avg.size();
    return a;
}
int productos_fecha_ven(Producto gondola[3][4]){
    int a;
    for(int i=0;i<3;i++){
        for(int j=0;j<4;j++){
            if(gondola[i][j].fecha_ven==true){
                a++;
            }
        }
    }
    return a;
}

int main(){
    Producto gondola[3][4];
    Producto producto;
    for(int i=0;i<3;i++){

        for(int j=0;j<4;j++){
            char ven;
            cout<<"nombre: "<<endl;
            cin>>producto.nombre;
            cout<<"codigo"<<endl;
            cin>>producto.codigo_barra;
            cout<<"marca: "<<endl;
            cin>>producto.marca;
            cout<<"precio: "<<endl;
            cin>>producto.precio;
            cout<<"fecha de vencimiento? y/n."<<endl;
            cin>>ven;
            if(ven=='y'){
                producto.fecha_ven=true;
            }
            else if(ven=='n'){
                producto.fecha_ven==false;
            }
            gondola[i][j]=producto;
        }
    }
    cout<<"columna del producto mas caro:"<<endl;
    cout<<producto_mas_caro(gondola)<<endl;
    cout<<"producto 2da fila 3ra columna"<<endl;
    cout<<gondola[2][3].nombre<<endl;
    cout<<gondola[2][3].codigo_barra<<endl;
    cout<<gondola[2][3].marca<<endl;
    cout<<gondola[2][3].precio<<endl;
    if(gondola[2][3].codigo_barra==true){
        cout<<"tiene fecha de vencimiento"<<endl;
    }
    else{
        cout<<"no tiene fecha de vencimiento"<<endl;
    }
    cout<<"promedio: "<<endl;
    cout<<promedio(gondola)<<endl;
    cout<<"cantidad de productos con fecha de vencimiento:"<<endl;
    cout<<productos_fecha_ven(gondola)<<endl;
}
