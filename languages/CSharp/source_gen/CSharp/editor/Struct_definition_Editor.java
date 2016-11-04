package CSharp.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.OldNewCompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class Struct_definition_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_z2ytjr_a(editorContext, node);
  }
  private EditorCell createCollection_z2ytjr_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_z2ytjr_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createConstant_z2ytjr_a0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_z2ytjr_b0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_z2ytjr_c0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_z2ytjr_d0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_z2ytjr_e0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_z2ytjr_f0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_z2ytjr_g0(editorContext, node));
    return editorCell;
  }
  private EditorCell createConstant_z2ytjr_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "struct");
    editorCell.setCellId("Constant_z2ytjr_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_z2ytjr_b0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Struct_definition_Editor.Identifier_1SingleRoleHandler_z2ytjr_b0(node, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f70d6L, 0x70aadf795f73fbL, "Identifier_1"), editorContext);
    return provider.createCell();
  }
  private class Identifier_1SingleRoleHandler_z2ytjr_b0 extends SingleRoleCellProvider {
    public Identifier_1SingleRoleHandler_z2ytjr_b0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(editorCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f70d6L, 0x70aadf795f73fbL, "Identifier_1"), child), new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext)));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("Identifier_1");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = createEmptyCell_internal(myEditorContext, myOwnerNode);

      installCellInfo(null, editorCell);
      return editorCell;
    }
    private EditorCell createEmptyCell_internal(EditorContext editorContext, SNode node) {
      return this.createConstant_z2ytjr_a1a(editorContext, node);
    }
    private EditorCell createConstant_z2ytjr_a1a(EditorContext editorContext, SNode node) {
      EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, " ");
      editorCell.setCellId("Constant_z2ytjr_a1a");
      editorCell.setDefaultText("");
      return editorCell;
    }
  }
  private EditorCell createRefNode_z2ytjr_c0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Struct_definition_Editor.Type_parameter_list_2SingleRoleHandler_z2ytjr_c0(node, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f70d6L, 0x70aadf795f73fcL, "Type_parameter_list_2"), editorContext);
    return provider.createCell();
  }
  private class Type_parameter_list_2SingleRoleHandler_z2ytjr_c0 extends SingleRoleCellProvider {
    public Type_parameter_list_2SingleRoleHandler_z2ytjr_c0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(editorCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f70d6L, 0x70aadf795f73fcL, "Type_parameter_list_2"), child), new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext)));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("Type_parameter_list_2");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = createEmptyCell_internal(myEditorContext, myOwnerNode);

      installCellInfo(null, editorCell);
      return editorCell;
    }
    private EditorCell createEmptyCell_internal(EditorContext editorContext, SNode node) {
      return this.createConstant_z2ytjr_a2a(editorContext, node);
    }
    private EditorCell createConstant_z2ytjr_a2a(EditorContext editorContext, SNode node) {
      EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, " ");
      editorCell.setCellId("Constant_z2ytjr_a2a");
      editorCell.setDefaultText("");
      return editorCell;
    }
  }
  private EditorCell createRefNode_z2ytjr_d0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Struct_definition_Editor.Struct_interfaces_3SingleRoleHandler_z2ytjr_d0(node, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f70d6L, 0x70aadf795f73fdL, "Struct_interfaces_3"), editorContext);
    return provider.createCell();
  }
  private class Struct_interfaces_3SingleRoleHandler_z2ytjr_d0 extends SingleRoleCellProvider {
    public Struct_interfaces_3SingleRoleHandler_z2ytjr_d0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(editorCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f70d6L, 0x70aadf795f73fdL, "Struct_interfaces_3"), child), new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext)));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("Struct_interfaces_3");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = createEmptyCell_internal(myEditorContext, myOwnerNode);

      installCellInfo(null, editorCell);
      return editorCell;
    }
    private EditorCell createEmptyCell_internal(EditorContext editorContext, SNode node) {
      return this.createConstant_z2ytjr_a3a(editorContext, node);
    }
    private EditorCell createConstant_z2ytjr_a3a(EditorContext editorContext, SNode node) {
      EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, " ");
      editorCell.setCellId("Constant_z2ytjr_a3a");
      editorCell.setDefaultText("");
      return editorCell;
    }
  }
  private EditorCell createRefNode_z2ytjr_e0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Struct_definition_Editor.Type_parameter_constraints_clauses_4SingleRoleHandler_z2ytjr_e0(node, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f70d6L, 0x70aadf795f73feL, "Type_parameter_constraints_clauses_4"), editorContext);
    return provider.createCell();
  }
  private class Type_parameter_constraints_clauses_4SingleRoleHandler_z2ytjr_e0 extends SingleRoleCellProvider {
    public Type_parameter_constraints_clauses_4SingleRoleHandler_z2ytjr_e0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(editorCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f70d6L, 0x70aadf795f73feL, "Type_parameter_constraints_clauses_4"), child), new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext)));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("Type_parameter_constraints_clauses_4");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = createEmptyCell_internal(myEditorContext, myOwnerNode);

      installCellInfo(null, editorCell);
      return editorCell;
    }
    private EditorCell createEmptyCell_internal(EditorContext editorContext, SNode node) {
      return this.createConstant_z2ytjr_a4a(editorContext, node);
    }
    private EditorCell createConstant_z2ytjr_a4a(EditorContext editorContext, SNode node) {
      EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, " ");
      editorCell.setCellId("Constant_z2ytjr_a4a");
      editorCell.setDefaultText("");
      return editorCell;
    }
  }
  private EditorCell createRefNode_z2ytjr_f0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Struct_definition_Editor.Struct_body_5SingleRoleHandler_z2ytjr_f0(node, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f70d6L, 0x70aadf795f73ffL, "Struct_body_5"), editorContext);
    return provider.createCell();
  }
  private class Struct_body_5SingleRoleHandler_z2ytjr_f0 extends SingleRoleCellProvider {
    public Struct_body_5SingleRoleHandler_z2ytjr_f0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(editorCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f70d6L, 0x70aadf795f73ffL, "Struct_body_5"), child), new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext)));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("Struct_body_5");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = createEmptyCell_internal(myEditorContext, myOwnerNode);

      installCellInfo(null, editorCell);
      return editorCell;
    }
    private EditorCell createEmptyCell_internal(EditorContext editorContext, SNode node) {
      return this.createConstant_z2ytjr_a5a(editorContext, node);
    }
    private EditorCell createConstant_z2ytjr_a5a(EditorContext editorContext, SNode node) {
      EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, " ");
      editorCell.setCellId("Constant_z2ytjr_a5a");
      editorCell.setDefaultText("");
      return editorCell;
    }
  }
  private EditorCell createConstant_z2ytjr_g0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ";");
    editorCell.setCellId("Constant_z2ytjr_g0");
    editorCell.setDefaultText("");
    return editorCell;
  }
}