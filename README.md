# VaiChove
=================

Utilização do Web Service da http://openweathermap.org/

O Open Weather Map é um site que disponibiliza várias APIs, algumas de forma gratuita, para consultas sobre o clima. Sua missão é fazer com que os dados sejam disponíveis e fáceis para integração em produtos da nuvem com sua API, para inspirar novas aplicações inovadoras com imagens, dados meteorológicos entre outros. A Open Weather Map coleta dados de milhares de sensores remotos distribuídos em todo o nosso planeta.

Seus serviços são compostos por:
- Dados de Tempo atual;
- Previsão de 5 dias/ 3 horas;
- Previsão diária;
- Histórico de dados meterológicos;
- Poluição do ar;
- Estações meteorológicas;
- Bulk dowloading;
- Weather map layers;

Foi utilizado apenas o servico de Dados meteorológicos em tempo real neste projeto.
As consultas realizadas foram:
- Consulta do tempo por nome da cidade;
- Consulta do tempo por CEP,
- Consulta do tempo por longitude e latitude;

### Passo 1: Criar conta no site
Para consumir o serviço é nessário realizar uma conta no site, com a conta criada você obtém sua API KEY na página de seu perfil, através dela você consegue realizar as solicitações para o Web Service para que o mesmo consiga identificar o solicitante e realizar a validação.

### Passo 2: Conhecer os EndPoints
Os EndPoints são as urls disponíveis pela API para que voce possa realizar a consulta que deseja.
Foram utilizados três endpoints neste projeto:
- Consulta por cidade:
```Console
api.openweathermap.org/data/2.5/weather?q=Goiania&appid={SUA_APPKEY}
```
 
- Consulta por Latitude e Longitude:
```Console
api.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid={SUA_APPKEY}
```
- Consulta por CEP
```Console
api.openweathermap.org/data/2.5/weather?zip=94040,us&appid={SUA_APPKEY}
```

O resultado será retornado no formato JSON, seguindo a seguinte estrutura:

```Console
{  
   "coord":{  
      "lon":-49.25,
      "lat":-16.68
   },
   "weather":[  
      {  
         "id":802,
         "main":"Clouds",
         "description":"scattered clouds",
         "icon":"03d"
      }
   ],
   "base":"stations",
   "main":{  
      "temp":298.48,
      "pressure":932.18,
      "humidity":68,
      "temp_min":298.48,
      "temp_max":298.48,
      "sea_level":1024.94,
      "grnd_level":932.18
   },
   "wind":{  
      "speed":3.55,
      "deg":146.512
   },
   "clouds":{  
      "all":36
   },
   "dt":1476963240,
   "sys":{  
      "message":0.0069,
      "country":"BR",
      "sunrise":1476953104,
      "sunset":1476998299
   },
   "id":3462377,
   "name":"Goiania",
   "cod":200
}
```

O tipo de dados de cada dado pode ser encontrado na documentação da API, dispovínel em http://openweathermap.org/current#current_JSON
