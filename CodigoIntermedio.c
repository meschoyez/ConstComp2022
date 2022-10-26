Códigos Intermedios

Código Tres Direcciones (TAC)

  x = y <op> z  --> Instrucción base
  x = y
  x = 6
  label l0
  jmp l0
  ifjmp x, l0
  push x
  pop x

ADD AX,BX,CX

Generador de nombres de variables temporales y etiquetas

y = x * 2 + z / 5;

t0 = x * 2
t1 = z / 5
t2 = t0 + t1
y = t2

----------------

y = (x - 1) * (x - 1);

t0 = x - 1
t1 = x - 1
t2 = t0 * t1
y = t2

optimizando
t0 = x - 1
y = t0 * t0

------------

if (x >= 0)
    y = x;
else
    y = -x;


t0 = x >= 0
ifnjmp t0, l0
y = x
jmp l1
label l0
y = -x
label l1

------------

for (i = 0; i < 0; ++i)
    y += i;


i = 0
label l0
t0 = i < 0
ifnjmp t0, l1
t1 = y + i
y = t1
i = i + 1
jmp l0
label l1





