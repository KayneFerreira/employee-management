import React from "react";

const FormContact = () => {
  return (
    <div>
      {/* FORM START */}
      <form className="row g-3 pb-2">
        <div className="col-md-6">
          <label htmlFor="inputEmail" className="form-label">
            Email
          </label>
          <input type="email" className="form-control" id="inputEmail" />
        </div>
        <div className="col-md-6">
          <label htmlFor="inputPhone" className="form-label">
            Telefone/Celular
          </label>
          <input type="text" className="form-control" id="inputPhone" />
        </div>
        <div className="col-12">
          <label htmlFor="inputAddress" className="form-label">
            Endereço
          </label>
          <input
            type="text"
            className="form-control"
            id="inputAddress"
          />
        </div>
        <div className="col-md-6">
          <label htmlFor="inputCity" className="form-label">
            Cidade
          </label>
          <input type="text" className="form-control" id="inputCity" />
        </div>
        <div className="col-md-4">
          <label htmlFor="inputState" className="form-label">
            Estado
          </label>
          <select id="inputState" className="form-select">
            <option defaultValue="">Escolha...</option>
            <option>...</option>
          </select>
        </div>
        <div className="col-md-2">
          <label htmlFor="inputZip" className="form-label">
            CEP
          </label>
          <input type="text" className="form-control" id="inputZip" />
        </div>
        <div className="col-12">
          <div className="form-check">
            <input
              className="form-check-input"
              type="checkbox"
              id="gridCheck"
            />
            <label className="form-check-label" htmlFor="gridCheck">
              PLACEHOLDER
            </label>
          </div>
        </div>
        <div className="col-12">
          <button type="submit" className="btn btn-primary">
            PLACEHOLDER
          </button>
        </div>
      </form>
      {/* FORM END */}
    </div>
  );
};

export default FormContact;
