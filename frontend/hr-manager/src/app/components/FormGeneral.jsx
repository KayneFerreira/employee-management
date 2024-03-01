import React from "react";

const FormGeneral = () => {
  return (
    <div>
      {/* FORM START */}
      <form className="row g-3 pb-3">
        <div className="col-md-6">
          <label htmlFor="inputName" className="form-label">
            Nome
          </label>
          <input type="email" className="form-control" id="inputName" />
        </div>
        <div className="col-md-6">
          <label htmlFor="inputUsername" className="form-label">
            Nome de Usuário
          </label>
          <input type="password" className="form-control" id="inputUsername" />
        </div>
        <div className="col-6">
          <label htmlFor="inputCpf" className="form-label">
            CPF
          </label>
          <input type="text" className="form-control" id="inputCpf" />
        </div>
        <div className="col-6">
          <label htmlFor="inputRg" className="form-label">
            RG
          </label>
          <input type="text" className="form-control" id="inputRg" />
        </div>
        <div className="col-md-5">
          <label htmlFor="inputPosition" className="form-label">
            Cargo
          </label>
          <input type="text" className="form-control" id="inputPosition" />
        </div>
        <div className="col-md-4">
          <label htmlFor="inputDepartment" className="form-label">
            Departamento
          </label>
          <select id="inputDepartment" className="form-select">
            <option defaultValue="">Escolha...</option>
            <option>...</option>
          </select>
        </div>
        <div className="col-md-3">
          <label htmlFor="inputSalary" className="form-label">
            Salário Mensal
          </label>
          <input type="text" className="form-control" id="inputSalary" />
        </div>
        <div className="col-md-12">
          <label htmlFor="inputObservations" className="form-label">
            Observações
          </label>
          <textarea type="text" className="form-control" id="inputObservations" rows="3" />
        </div>
      </form>
      {/* FORM END */}
    </div>
  );
};

export default FormGeneral;
