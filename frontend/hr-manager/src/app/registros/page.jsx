import React from "react";
import Accordion from "../components/Accordion";
import FormGeneral from "../components/FormGeneral";
import FormContact from "../components/FormContact";

const Registro = () => {
  return (
    <div className="m-3">
      <h1>Registro de Colaboradores</h1>
      <hr className="hr" />

      <Accordion title="Dados Gerais">
        <FormGeneral />
      </Accordion>

      <Accordion title="Dados de Contato">
        <FormContact />
      </Accordion>
    </div>
  );
};

export default Registro;
