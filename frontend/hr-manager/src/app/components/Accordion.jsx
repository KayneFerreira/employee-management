import React from "react";

const Accordion = ({ children, title, id, headingId, contentId }) => {
  return (
    <div className="accordion mb-4" id={id}>
      <div className="accordion-item">
        <h2 className="accordion-header" id={headingId}>
          <button
            className="accordion-button bg-dark-subtle text-dark"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target={"#" + contentId}
            aria-expanded="true"
            aria-controls={contentId}
          >
            {title}
          </button>
        </h2>
        <div
          id={contentId}
          className="accordion-collapse collapse show"
          aria-labelledby={headingId}
          data-bs-parent={"#" + id}
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
