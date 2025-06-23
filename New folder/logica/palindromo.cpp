#include <stdio.h>
#include <string.h>
#include <ctype.h>
void limpiarFrase(const char* original, char* limpia) {
    int j = 0;
    for (int i = 0; original[i] != '\0'; i++) {
        if (original[i] != ' ') {
            limpia[j++] = tolower(original[i]);
        }
    }
    limpia[j] = '\0';
}
int esPalindromo(const char* frase) {
    int izquierda = 0;
    int derecha = strlen(frase) - 1;
    while (izquierda < derecha) {
        if (frase[izquierda] != frase[derecha]) {
            return 0; // No es palíndromo
        }
        izquierda++;
        derecha--;
    }
    return 1; // Sí es palíndromo
}
int main() {
    char frase[] = "Anita lava la tina";
    char fraseLimpia[100];
    limpiarFrase(frase, fraseLimpia);
    if (esPalindromo(fraseLimpia)) {
        printf("Es un palindromo.\n");
    } else {
        printf("No es un palindromo.\n");
    }
    return 0;
}