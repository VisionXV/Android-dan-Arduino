// Smart House Simple Controller for Android
// Jonathan Tjandra 16516160
// Fadhila Daliana 16516244
// Gabrielle Shay A 16516404
// Introduction to Engineering and Design I - 2016
char fac;
 void setup() {
   pinMode(2,OUTPUT);
   pinMode(3,OUTPUT);
   pinMode(4,OUTPUT);
   pinMode(5,OUTPUT);
   pinMode(6,OUTPUT);
   Serial.begin(9600);
 }

 void loop() {
 if( Serial.available() >0 ) {
     fac = Serial.read();
     Serial.println(fac); 
 }
   if( fac == '1' ) {
     digitalWrite(2,HIGH); }
   else if( fac == '2' ) {
     digitalWrite(3,HIGH); }
   else if( fac == '3' ) {
     digitalWrite(4,HIGH); }
   else if( fac == '4' ) {
     digitalWrite(5,HIGH); }
   else if( fac == '5' ) (
    digitalWrite(6,HIGH); }
    else if (fac == '6'){
     digitalWrite(2,HIGH);
     digitalWrite(3,HIGH);
     digitalWrite(4,HIGH);
     digitalWrite(5,HIGH);
     digitalWrite(6,HIGH);
  }
   else if( fac == 'A' ) {
     digitalWrite(2,LOW); }
   else if( fac == 'B' ) {
     digitalWrite(3,LOW); }
   else if( fac == 'C' ) {
     digitalWrite(4,LOW); }
   else if( fac == 'D' ) {
     digitalWrite(5,LOW); }
   else if( fac == 'E' ){ 
   digitalWrite(6,LOW); }
   else if ( fac == 'F' ){
     digitalWrite(2,LOW);
     digitalWrite(3,LOW);
     digitalWrite(4,LOW);
     digitalWrite(5,LOW);
     digitalWrite(6,LOW);
   }
 } 
