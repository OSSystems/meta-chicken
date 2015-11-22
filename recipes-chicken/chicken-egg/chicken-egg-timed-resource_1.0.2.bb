SECTION = "devel/chicken"
DESCRIPTION = "Resource w/ Timeout"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://timed-resource.meta;md5=656963758ba49ab56c7be6be3764ee7f"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-record-variants-cross chicken-egg-check-errors-cross chicken-egg-thread-utils-cross chicken-egg-synch-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-record-variants-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-thread-utils-crosssdk chicken-egg-synch-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-record-variants nativesdk-chicken-egg-check-errors nativesdk-chicken-egg-thread-utils nativesdk-chicken-egg-synch chicken-egg-setup-helper-crosssdk chicken-egg-record-variants-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-thread-utils-crosssdk chicken-egg-synch-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-record-variants chicken-egg-check-errors chicken-egg-thread-utils chicken-egg-synch chicken-egg-setup-helper-cross chicken-egg-record-variants-cross chicken-egg-check-errors-cross chicken-egg-thread-utils-cross chicken-egg-synch-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-record-variants chicken-egg-check-errors chicken-egg-thread-utils chicken-egg-synch"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/timed-resource/timed-resource-${PV}.tar.gz"

SRC_URI[md5sum] = "07b421311cc58609480c05fb3b532552"
SRC_URI[sha256sum] = "c108eb5506e66ff359e8e50d299acd29520d4fcabfdf419608e708f6e090864e"

S = "${WORKDIR}/timed-resource-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
