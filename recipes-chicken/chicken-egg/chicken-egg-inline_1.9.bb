SECTION = "devel/chicken"
DESCRIPTION = "Use compiled code inside interpreter scripts"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://inline.meta;md5=6bce2084ad4d384fb84a24e5c0de602b"
DEPENDS_append_class-cross = " chicken-egg-bind-cross chicken-egg-simple-sha1-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-bind-crosssdk chicken-egg-simple-sha1-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-bind nativesdk-chicken-egg-simple-sha1 chicken-egg-bind-crosssdk chicken-egg-simple-sha1-crosssdk"
DEPENDS = " chicken-egg-bind chicken-egg-simple-sha1 chicken-egg-bind-cross chicken-egg-simple-sha1-cross chicken-egg-inline-cross"
RDEPENDS_${PN} = " chicken-egg-bind chicken-egg-simple-sha1"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/inline/inline-${PV}.tar.gz"

SRC_URI[md5sum] = "fc3803ae8e736306ed10d06def7e3131"
SRC_URI[sha256sum] = "463f2f63ffe223536d50c2b838eb2fdb6b4dea5fd94b2e30eed625cfcd261db2"

S = "${WORKDIR}/inline-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
