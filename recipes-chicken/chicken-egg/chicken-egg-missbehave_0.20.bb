SECTION = "devel/chicken"
DESCRIPTION = "Behaviour Driven Scheme"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://missbehave.meta;md5=9f0e03500ac8c458c1f7fe7950379f09"
DEPENDS_append_class-cross = " chicken-egg-args-cross chicken-egg-fmt-cross chicken-egg-advice-cross chicken-egg-miscmacros-cross chicken-egg-sequences-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-args-crosssdk chicken-egg-fmt-crosssdk chicken-egg-advice-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-sequences-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-args nativesdk-chicken-egg-fmt nativesdk-chicken-egg-advice nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-sequences chicken-egg-args-crosssdk chicken-egg-fmt-crosssdk chicken-egg-advice-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-sequences-crosssdk"
DEPENDS = " chicken-egg-args chicken-egg-fmt chicken-egg-advice chicken-egg-miscmacros chicken-egg-sequences chicken-egg-args-cross chicken-egg-fmt-cross chicken-egg-advice-cross chicken-egg-miscmacros-cross chicken-egg-sequences-cross"
RDEPENDS_${PN} = " chicken-egg-args chicken-egg-fmt chicken-egg-advice chicken-egg-miscmacros chicken-egg-sequences"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/missbehave/missbehave-${PV}.tar.gz"

SRC_URI[md5sum] = "41f59f346feb43a7e194b457166c10de"
SRC_URI[sha256sum] = "7449e86246a990bee4bc4a50a924347d324a2b465309f4a50298fd276e26a570"

S = "${WORKDIR}/missbehave-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
