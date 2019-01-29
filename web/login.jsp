
<!DOCTYPE html>
<html>
    <head>
        <style>
        div {
  padding: 20px;
  border: 2px solid;
}

</style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <meta name="viewport" content="width=device-width,initial-scale=1">
        
        <title>login here</title>
    </head>
    <body>
       <div>
            <center>
             <h1>Register</h1>
           <form action="loginmem" method="POST">
            Name:
            <input type="text" name="name" value=""><br><br>
            Gender:
            <input type="radio" name="gender" value="male" > Male
             <input type="radio" name="gender" value="female"> Female
             <input type="radio" name="gender" value="other"> Other<br><br>
            Email:
            <input type="email" name="email" value="" ><br><br>
            
             Address:
             <select name="address"><br><br>
                 
                 <option value="kathmandu">kathmandu</option>
                 <option value="Nuwakot">Nuwakot</option>
                 <option value="kaski">kaski</option>
                 <option value="Bhaktapur">Bhaktapur</option>
                 <option value="kirtipur">kirtipur</option>
                 <option value="Dharan">Dharan</option>
                 <option value="kath">Dolpa</option>
                 <option value="Mahendranagar">Mahendranagar</option>
                 <option value="Gorkha">Gorkha</option>
                 <option value="Dhading">Dhading</option>
                 <option value="Sankhuwasava">Sankhuwasava</option>
                 <option value="Biratnagar">Biratnagar</option>
                 <option value="Lamjung">Lamjung</option>
                 <option value="Solukhumbu">Solukhumbu</option></select><br><br>
                
                 Qualification:
                 <input name="qualification">
                 <br>
                 <br>
                 Languages:
                 <input name="language"><br>
                 <br>
                 <input type="submit" value="submit">    
                 </center>
        </form>    
        
        </div>
        
    </body>
</html>
