var img = new SimpleImage(200,200);
print(img)
for (var p of img.values()){
    p.setRed(255);
    p.setGreen(255)
}
print(img);
for (var p of img.values()){
    p.setRed(255);
    p.setGreen(0);
    p.setBlue(255);
}
print(img);
