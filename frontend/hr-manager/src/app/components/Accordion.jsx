import React from "react";

const Accordion = ({ children, title }) => {
  return (
    <div className="accordion mb-4" id="accordionExample">
      <div className="accordion-item">
        <h2 className="accordion-header" id="headingOne">
          <button
            className="accordion-button"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#collapseOne"
            aria-expanded="true"
            aria-controls="collapseOne"
          >
            {title}
          </button>
        </h2>
        <div
          id="collapseOne"
          className="accordion-collapse collapse show"
          aria-labelledby="headingOne"
          data-bs-parent="#accordionExample"
        >
          <div className="accordion-body">
            {/* ACCORDION CONTENT */}
            {children}
          </div>
        </div>
      </div>
    </div>
  );
};

export default Accordion;
