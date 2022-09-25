# RecruitmentProjectH

Analiza poniższego kodu i zaimplementowanie metod findBlockByColor, findBlocksByMaterial, count w klasie Wall 
- najchętniej unikając powielania kodu i umieszczając całą logikę w klasie Wall. Z uwzględnieniem w analizie i implementacji
- interfejsu CompositeBlock!

interface Structure {
// zwraca dowolny element o podanym kolorze
Optional findBlockByColor(String color);

// zwraca wszystkie elementy z danego materiału
List findBlocksByMaterial(String material);

//zwraca liczbę wszystkich elementów tworzących strukturę
int count();
}

public class Wall implements Structure {
private List blocks;
}

interface Block {
String getColor();
String getMaterial();
}

interface CompositeBlock extends Block {
List getBlocks();
}

--> być może compositeBlock zawiera jednorodne blocki