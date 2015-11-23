SECTION = "devel/chicken"
DESCRIPTION = "A tool to generate manifests for Ugarit archival mode"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://ugarit-manifest-maker.meta;md5=0517fad2e2e810ae32507eae32f7211d"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross chicken-egg-srfi-37-cross chicken-egg-fnmatch-cross chicken-egg-miscmacros-cross chicken-egg-ugarit-cross chicken-egg-numbers-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk chicken-egg-srfi-37-crosssdk chicken-egg-fnmatch-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-ugarit-crosssdk chicken-egg-numbers-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable nativesdk-chicken-egg-srfi-37 nativesdk-chicken-egg-fnmatch nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-ugarit nativesdk-chicken-egg-numbers chicken-egg-matchable-crosssdk chicken-egg-srfi-37-crosssdk chicken-egg-fnmatch-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-ugarit-crosssdk chicken-egg-numbers-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-srfi-37 chicken-egg-fnmatch chicken-egg-miscmacros chicken-egg-ugarit chicken-egg-numbers chicken-egg-matchable-cross chicken-egg-srfi-37-cross chicken-egg-fnmatch-cross chicken-egg-miscmacros-cross chicken-egg-ugarit-cross chicken-egg-numbers-cross"
RDEPENDS_${PN} = " chicken-egg-matchable chicken-egg-srfi-37 chicken-egg-fnmatch chicken-egg-miscmacros chicken-egg-ugarit chicken-egg-numbers"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/ugarit-manifest-maker/ugarit-manifest-maker-${PV}.tar.gz"

SRC_URI[md5sum] = "5ce749a491297f3c5100ff4fdaf8a97d"
SRC_URI[sha256sum] = "62da52d20c9cb8dd4e82956a48a106ab6a4f45250b2b812503bc783cf4e85140"

S = "${WORKDIR}/ugarit-manifest-maker-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
