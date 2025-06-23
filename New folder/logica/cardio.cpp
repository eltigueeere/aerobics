#include <iostream>
#include <algorithm> // Para transform()
#include <cmath> //sqrt(n) abs(n)
#include <string>
using namespace std;
int main() {
    float temperaturas[10] = {36.5, 38.1, 35.8, 37.0, 39.2, 36.9, 35.5, 38.0, 36.7, 37.3};
    // Mostrar float
    cout << "\n--- Arreglo float: Temperaturas ---\n";
    for (int i = 0; i < 10; i++) {
        cout << "Temperatura[" << i << "]: " << temperaturas[i] << endl;
            cout << "- Como string: " << to_string(temperaturas[i]) << endl;
    }


    int edades[10] = {25, 42, 19, 33, 58, 21, 47, 30, 61, 38};
    // Mostrar int
    cout << "\n--- Arreglo int: Edades ---\n";
    for (int i = 0; i < 10; i++) {
        cout << "Edad[" << i << "]: " << edades[i] << endl;
            //cout << "- Como string: " << to_string(edades[i]) << endl;
            cout << "- Es par?: " << ((edades[i] % 2 == 0) ? "Si" : "No") << endl;
            cout << "- Raiz cuadrada: " << sqrt(edades[i]) << endl;
            cout << "- Absoluto de -numero: " << abs(-1*edades[i]) << endl;
    }


    string nombres[10] = {"Ana", "juan", "Carlos", "beatriz", "Ximena", "roberto", "Luis", "maria", "Daniel", "elena"};
    // Mostrar string y aplicar funciones comunes
    cout << "\n--- Arreglo string: Nombres ---\n";
    for (int i = 0; i < 10; i++) {
        string nombre = nombres[i];
        cout << "\nNombre original: " << nombre;
        // Funcion: empty()
        cout << "\n - Esta vacio?: " << (nombre.empty() ? "Si" : "No");
        // Funcion: at(2)
        if (nombre.length() > 2) {
            cout << "\n - Caracter en posicion 2 (at(2)): " << nombre.at(2);
        } else {
            cout << "\n - (Muy corto para at(2))";
        }
        // Funcion: find("ar")
        size_t pos = nombre.find("ar");
        if (pos != string::npos) {
                cout << "\n - SI Contiene 'ar' en posicion: " << pos;
        } else {
            cout << "\n - No contiene 'ar'";
        }
        // Funcion: append("FIN")
        string nombreConFin = nombre;
        nombreConFin.append("*APPEND*");
        cout << "\n - Con 'FIN' al final: " << nombreConFin;

        cout << "\n--------------------------";
    }
    cout << "Presiona Enter para salir...";
    cin.get(); // Espera que el usuario presione Enter
    return 0;
}