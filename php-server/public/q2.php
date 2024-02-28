<?php
$fuso = new DateTimeZone("America/Sao_Paulo");
$hoje = new DateTime("now", $fuso);
$formato= "H";
$hora = (int) $hoje->format( $formato );


hour($hora, $nome );

if ($hora >= 6 && $hora < 12){
    echo "Bom dia!\n";
}

else if ($hora >= 12 && $hora < 18){
    echo "Boa tarde\n";
}

else {
    echo "Boa noite\n";
}

function hour($rel, $name){
    echo "Olá ". ($name) ."\n";
    echo "Seu hórario atual é: ". ($rel) ."\n";
}