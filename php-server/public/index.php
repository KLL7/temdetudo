<?php

echo "vamos somar!\n";

$escolha = (int) readline("Qual a operação desejada? (1) soma (2)subtração (3)multiplicação (4)divisão: ");
while ($escolha < 1 || $escolha > 4){
    echo "Opcão inválida!\n";
    $escolha = (int) readline("Qual a operação desejada? (1) soma (2)subtração (3)multiplicação (4)divisão: ");
}

$um = (int) readline("primeiro número: ");
$dois = (int) readline("segundo número: ");

function sum($pri, $seg){
    echo "Sua soma é: ". ($pri+$seg) ."\n";
}

function sub($pri, $seg){
    echo "Sua subtração é: ". ($pri - $seg) . "\n";
}

function mult($pri, $seg){
    echo "Sua multiplicação é: ". ($pri*$seg) ."\n";
}

function div($pri, $seg){
    echo "Sua divisão é: ". ($pri/$seg) ."\n";
}

if ($escolha == 1){
    sum($um, $dois);
}

if ($escolha == 2){
    sub($um, $dois);
}

if ($escolha == 3){
    mult($um, $dois);
}

if ($escolha == 4){
    div($um, $dois);
}