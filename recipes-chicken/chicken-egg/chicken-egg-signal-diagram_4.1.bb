SECTION = "devel/chicken"
DESCRIPTION = "Signal function combinators."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://signal-diagram.meta;md5=fa138067286cb5a894cd01d793a31790"
DEPENDS_append_class-cross = " chicken-egg-make-cross chicken-egg-mathh-cross chicken-egg-datatype-cross chicken-egg-flsim-cross chicken-egg-dyn-vector-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-make-crosssdk chicken-egg-mathh-crosssdk chicken-egg-datatype-crosssdk chicken-egg-flsim-crosssdk chicken-egg-dyn-vector-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-make nativesdk-chicken-egg-mathh nativesdk-chicken-egg-datatype nativesdk-chicken-egg-flsim nativesdk-chicken-egg-dyn-vector chicken-egg-make-crosssdk chicken-egg-mathh-crosssdk chicken-egg-datatype-crosssdk chicken-egg-flsim-crosssdk chicken-egg-dyn-vector-crosssdk"
DEPENDS = " chicken-egg-make chicken-egg-mathh chicken-egg-datatype chicken-egg-flsim chicken-egg-dyn-vector chicken-egg-make-cross chicken-egg-mathh-cross chicken-egg-datatype-cross chicken-egg-flsim-cross chicken-egg-dyn-vector-cross chicken-egg-signal-diagram-cross"
RDEPENDS_${PN} = " chicken-egg-make chicken-egg-mathh chicken-egg-datatype chicken-egg-flsim chicken-egg-dyn-vector"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/signal-diagram/signal-diagram-${PV}.tar.gz"

SRC_URI[md5sum] = "d01a302ddaa81195c9cb1b6734203387"
SRC_URI[sha256sum] = "2839c55421a4570cffc9d9a45e35f3b3a06a61ccc994e1eac7f7969db6bd2351"

S = "${WORKDIR}/signal-diagram-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
