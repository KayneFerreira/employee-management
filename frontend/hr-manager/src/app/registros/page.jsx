import React from "react";
import Accordion from "../components/Accordion";
import FormGeneral from "../components/FormGeneral";
import FormContact from "../components/FormContact";

const Registro = () => {
  return (
    <div className="m-3">
      <h1>Registro de Colaboradores</h1>
      <hr className="hr" />

      <Accordion
        title="Dados Gerais"
        id="accordion-2"
        contentId="content-1"
        headingId="heading-1"
      >
        <FormGeneral />
      </Accordion>

      <Accordion
        title="Dados do Contato"
        id="accordion-2"
        contentId="content-2"
        headingId="heading-2"
      >
        <FormContact />
      </Accordion>
    </div>
  );
};

export default Registro;
