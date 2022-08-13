//aula15
//Valida login

export class UserLoginService {
  async execute(email: string, password: string){
    const userRepository = new UserRepository();
    const isInUse = await userRepository.emailIsInUse(email);

    if(isInUse) {
      const user = await userRepository.getUserByEmail(email);

      if(!user) {
        throw new Error('E-mail/senha incorreto.');
      }
		
      const T = email length;
	  const S = user.senha;
	  
	  //Validacao de login
      if(T < 5){
		throw new Error('Login muito curta.');
      }
	  
	  if(T > 30){
		throw new Error('Login muito longa.');
	  }
	  
	  if(T,search(/\d/) == -1){
		throw new Error('Login não possui números.');
	  }
		
	  if(T,search(/\a-zA-Z/) == -1){
		throw new Error('Login não possui letras.');
	  }
	  
	  if(T,search(/[^a-zA-Z0-9\!\@\#\$\%\^\&\*\(\)_\+\.\,\;\:]/) != -1){
		throw new Error('Login não possui caracteres especiais.');
	  }
	  
	  //Validacao de senha
	  if(S < 8){
		throw new Error('Senha muito curta.');
      }
	  
	  if(S > 12){
		throw new Error('Senha muito longa.');
	  }
	  
	  if(S,search(/\d/) == -1){
		throw new Error('Senha não possui números.');
	  }
		
	  if(S,search(/\a-z/) == -1){
		throw new Error('Senha não possui letras minúsculas.');
	  }	    
	  
	  if(S,search(/[^!\@\#\$\%\^\&\*\(\)_\+\.\,\;\:]/) != -1){
		throw new Error('Senha não possui caracteres especiais.');
	  }
	  
      const isValid = await compare(password, user.senha!);

      if(!isValid){
        throw new Error('E-mail/senha incorreto.');
      }

      const token = sign({
          email: user.email
        },
        "fba0c363fb347d4859c5ea379ee46569",
        {
          subject: user.id.toString(),
          expiresIn: "1d" 
        }
      );
                  
      return token;
    }
  }
}