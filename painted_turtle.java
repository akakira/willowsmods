// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class painted_turtle extends EntityModel<Entity> {
	private final ModelRenderer turtle;
	private final ModelRenderer shell;
	private final ModelRenderer edge;
	private final ModelRenderer head;
	private final ModelRenderer leftfrontleg;
	private final ModelRenderer rightfrontleg;
	private final ModelRenderer backleftleg;
	private final ModelRenderer backrightleg;
	private final ModelRenderer tail;
	private final ModelRenderer tail_r1_r1;

	public painted_turtle() {
		textureWidth = 64;
		textureHeight = 64;

		turtle = new ModelRenderer(this);
		turtle.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(turtle, 0.0F, 1.5708F, 0.0F);
		

		shell = new ModelRenderer(this);
		shell.setRotationPoint(0.0F, 0.0F, 0.0F);
		turtle.addChild(shell);
		shell.setTextureOffset(0, 10).addBox(-4.5F, -8.0F, -4.0F, 9.0F, 5.0F, 8.0F, 0.0F, false);

		edge = new ModelRenderer(this);
		edge.setRotationPoint(0.0F, 0.0F, 1.0F);
		turtle.addChild(edge);
		edge.setTextureOffset(0, 0).addBox(-5.5F, -3.0F, -5.5F, 11.0F, 1.0F, 9.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(3.5F, 0.0F, 3.5F);
		turtle.addChild(head);
		head.setTextureOffset(0, 23).addBox(1.0F, -3.0F, -4.5F, 5.0F, 2.0F, 2.0F, 0.0F, false);

		leftfrontleg = new ModelRenderer(this);
		leftfrontleg.setRotationPoint(0.0F, 0.0F, 0.0F);
		turtle.addChild(leftfrontleg);
		leftfrontleg.setTextureOffset(22, 23).addBox(3.5F, -2.0F, 2.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		rightfrontleg = new ModelRenderer(this);
		rightfrontleg.setRotationPoint(0.0F, 0.0F, 0.0F);
		turtle.addChild(rightfrontleg);
		rightfrontleg.setTextureOffset(14, 23).addBox(3.5F, -2.0F, -4.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		backleftleg = new ModelRenderer(this);
		backleftleg.setRotationPoint(0.0F, 0.0F, 0.0F);
		turtle.addChild(backleftleg);
		backleftleg.setTextureOffset(0, 10).addBox(-5.5F, -2.0F, 2.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		backrightleg = new ModelRenderer(this);
		backrightleg.setRotationPoint(-4.5F, 0.5F, -3.5F);
		turtle.addChild(backrightleg);
		backrightleg.setTextureOffset(0, 0).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 0.0F, 0.0F);
		turtle.addChild(tail);
		

		tail_r1_r1 = new ModelRenderer(this);
		tail_r1_r1.setRotationPoint(-5.0F, -2.0F, 0.0F);
		tail.addChild(tail_r1_r1);
		setRotationAngle(tail_r1_r1, 0.0F, 0.0F, 1.0036F);
		tail_r1_r1.setTextureOffset(0, 5).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		turtle.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}