SECTION = "devel/chicken"
DESCRIPTION = "Performs automatic differentiation"
LICENSE = "LGPLv2+"
LIC_FILES_CHKSUM = "file://AD.meta;md5=6810e6ea53ddc5779867dcb60125ece2"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-define-structure-cross chicken-egg-traversal-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-define-structure-crosssdk chicken-egg-traversal-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-define-structure nativesdk-chicken-egg-traversal chicken-egg-setup-helper-crosssdk chicken-egg-define-structure-crosssdk chicken-egg-traversal-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-define-structure chicken-egg-traversal chicken-egg-setup-helper-cross chicken-egg-define-structure-cross chicken-egg-traversal-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-define-structure chicken-egg-traversal"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/AD/AD-${PV}.tar.gz"

SRC_URI[md5sum] = "448e3dd7c0bbe47dbec14b56d613e8a2"
SRC_URI[sha256sum] = "a343e3103fab66caaef6d106817509fe44b2558d001b0c4cc158c6943b58baf1"

S = "${WORKDIR}/AD-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
