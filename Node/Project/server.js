const express = require('express');
const app = express();
const port = process.env.PORT || 3000;

app.get('/', (req, res) => {
  res.send('Implantação efetuada com sucesso');
});

app.listen(port, () => {
  console.log(`Aplicação ouvindo na porta ${port}`);
});
