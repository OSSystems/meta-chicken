SECTION = "devel/chicken"
DESCRIPTION = "A library to parse and unparse Ethernet frames"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://ethernet.meta;md5=d30ae29b51c53d4b18de393e8b9510eb"
DEPENDS_append_class-cross = " chicken-egg-defstruct-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-defstruct-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-defstruct chicken-egg-defstruct-crosssdk"
DEPENDS = " chicken-egg-defstruct chicken-egg-defstruct-cross"
RDEPENDS_${PN} = " chicken-egg-defstruct"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/ethernet/ethernet-${PV}.tar.gz"

SRC_URI[md5sum] = "9c8d7f32aef68bbd8b649ea4e1df286b"
SRC_URI[sha256sum] = "030d8e526750d11593efd7ec61d3f3c0506b482b8d628c0644c549c6ff186795"

S = "${WORKDIR}/ethernet-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
