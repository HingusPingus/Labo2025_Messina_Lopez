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

int main(){

}