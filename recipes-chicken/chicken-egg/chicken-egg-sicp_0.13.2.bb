SECTION = "devel/chicken"
DESCRIPTION = "Support for SICP"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://sicp.meta;md5=ca6d1bf223f1b5a642ccee8313c7d0fb"
DEPENDS_append_class-cross = " chicken-egg-debug-cross chicken-egg-hahn-cross chicken-egg-htmlprag-cross chicken-egg-matchable-cross chicken-egg-setup-helper-cross chicken-egg-shell-cross chicken-egg-token-substitution-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-debug-crosssdk chicken-egg-hahn-crosssdk chicken-egg-htmlprag-crosssdk chicken-egg-matchable-crosssdk chicken-egg-setup-helper-crosssdk chicken-egg-shell-crosssdk chicken-egg-token-substitution-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-debug nativesdk-chicken-egg-hahn nativesdk-chicken-egg-htmlprag nativesdk-chicken-egg-matchable nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-shell nativesdk-chicken-egg-token-substitution chicken-egg-debug-crosssdk chicken-egg-hahn-crosssdk chicken-egg-htmlprag-crosssdk chicken-egg-matchable-crosssdk chicken-egg-setup-helper-crosssdk chicken-egg-shell-crosssdk chicken-egg-token-substitution-crosssdk"
DEPENDS = " chicken-egg-debug chicken-egg-hahn chicken-egg-htmlprag chicken-egg-matchable chicken-egg-setup-helper chicken-egg-shell chicken-egg-token-substitution chicken-egg-debug-cross chicken-egg-hahn-cross chicken-egg-htmlprag-cross chicken-egg-matchable-cross chicken-egg-setup-helper-cross chicken-egg-shell-cross chicken-egg-token-substitution-cross chicken-egg-sicp-cross"
RDEPENDS_${PN} = " chicken-egg-debug chicken-egg-hahn chicken-egg-htmlprag chicken-egg-matchable chicken-egg-setup-helper chicken-egg-shell chicken-egg-token-substitution"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sicp/sicp-${PV}.tar.gz"

SRC_URI[md5sum] = "e069ae7d8737091c7efc6aba75ee9e52"
SRC_URI[sha256sum] = "9fa7a14c668788729df25e9e48a01e9d4489793be5adb6252e9e9e302989cefe"

S = "${WORKDIR}/sicp-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
